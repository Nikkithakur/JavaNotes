package practice.linkedlist;

import java.util.List;

public class ArrayEntityUpdater<Context, Entity, Model> {

	public IKeyMatch<Entity, Model> keyMatch;
	public PrimaryKeyRetrieval<Model> keyRetrieval;
	public InsertEntity<Context, Entity, Model> insertEntity;
	public UpdateEntity<Entity, Model> updateEntity;
	public RemoveEntity<Context, Entity> deleteEntity;
	public EntityMatch<Entity, Model> matchingEntity;
	public EntitiesForRemoval<Entity, Model> queueForRemoval;
	public SubEntityUpdater<Entity, Model> subEntityUpdater;

	public interface IKeyMatch<Entity, Model> {
		public Boolean isPrimaryKeyMatching(Entity entity, Model model);
	}
	
	public interface PrimaryKeyRetrieval<Model> {
		public Integer retrievePrimaryKey(Model model);
	}
	
	public interface InsertEntity<Context, Entity, Model> {
		public Entity createEntity(Context context, Model model);
	}
	
	public interface UpdateEntity<Entity, Model> {
		public void updateEntityWithModelData(Entity entity, Model model);
	}
	
	public interface RemoveEntity<Context, Entity> {
		public void removeEntities(Context context, List<Entity> entities);
	}
	
	public interface EntityMatch<Entity, Model> {
		public Entity findMatchingEntity(List<Entity> entities, Model model);
	}
	
	public interface EntitiesForRemoval<Entity, Model> {
		public List<Entity> findEntitiesForRemoval(List<Entity> entities, List<Model> models);
	}
	
	public interface SubEntityUpdater<Entity, Model> {
		public void updateEntity(Entity entity, Model model);
	}
	

	public void updateEntityProperties(Context context, List<Entity> entities, List<Model> models,
			UpdateEntity<Entity, Model> updater) {
		List<Entity> toRemove = this.queueForRemoval.findEntitiesForRemoval(entities, models);
		if (!toRemove.isEmpty()) {
			this.deleteEntity.removeEntities(context, toRemove);
		}
		if (models != null) {
			models.forEach(model -> {
				Entity entity = null;
				Integer modelId = this.keyRetrieval.retrievePrimaryKey(model);
				if (modelId == null) {
					entity = this.insertEntity.createEntity(context, model);
				} else {
					entity = this.matchingEntity.findMatchingEntity(entities, model);
					if (keyMatch.isPrimaryKeyMatching(entity, model)) {
						this.updateEntity.updateEntityWithModelData(entity, model);
					}
				}
				if (this.subEntityUpdater != null) {
					this.subEntityUpdater.updateEntity(entity, model);
				}
				updater.updateEntityWithModelData(entity, model);
			});
		}
	}

}

package com.edusys.dao;

import java.util.List;

abstract public class EduSysDAO<EntityType, KeyType> {
    abstract public void insert(EntityType entity);
    abstract public void update(EntityType entity);
    abstract public void delete(KeyType id);
    abstract public EntityType selectByID (KeyType id);
    abstract public List<EntityType> selectAll();
    abstract protected List<EntityType> selectBySQL(String sql, Object...args);
}

package com.xml.mapper.base;

public interface BaseMapper<T> {
    public T findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);

    public void update(T t);

    public void create(T t);
}

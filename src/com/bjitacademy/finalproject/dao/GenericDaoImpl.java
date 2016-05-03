package com.bjitacademy.finalproject.dao;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.usertype.ParameterizedType;


public abstract class GenericDaoImpl<E, K extends Serializable> 
implements GenericDao<E, K> {

private SessionFactory sessionFactory;

protected Class<? extends E> daoType;

/**
* By defining this class as abstract, we prevent Spring from creating 
* instance of this class If not defined as abstract, 
* getClass().getGenericSuperClass() would return Object. There would be 
* exception because Object class does not hava constructor with parameters.
*/
@SuppressWarnings("unchecked")
public GenericDaoImpl(Class<E> type) {
Type t = getClass().getGenericSuperclass();
ParameterizedType pt = (ParameterizedType) t;
daoType = type;
//daoType = (Class) pt.getActualTypeArguments()[0];
}

protected Session currentSession() {
return sessionFactory.getCurrentSession();
}

@Override
public void add(E entity) {
currentSession().save(entity);
}

@Override
public void saveOrUpdate(E entity) {
currentSession().saveOrUpdate(entity);
}

@Override
public void update(E entity) {
currentSession().saveOrUpdate(entity);
}

@Override
public void remove(E entity) {
currentSession().delete(entity);
}

@Override
public E find(K key) {
return (E) currentSession().get(daoType, key);
}

@Override
public List<E> getAll() {
return currentSession().createCriteria(daoType).list();
}
}

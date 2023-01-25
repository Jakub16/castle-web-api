package com.castle.webapi.mappers;

public interface IMapEntities<TEntity, TDto> {
    TDto map(TEntity entity);
    TDto map(TEntity entity, TDto dto);
}

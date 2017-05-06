package com.manage.commom;

import java.sql.ResultSet;

public interface RowMap<T> {
   public T rowMapping(ResultSet rs);
}

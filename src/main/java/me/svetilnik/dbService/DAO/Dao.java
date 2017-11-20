package me.svetilnik.dbService.DAO;

import me.svetilnik.agentstvo.servlet.model.Model;

import java.io.IOException;
import java.util.List;

public interface Dao <T extends Model> {
    List<T> getAll(int offcet, int limit) throws IOException;
    T getById(Long id) throws IOException;
    void insert (T entity) throws IOException;
    void delete (Long id) throws IOException;
    void update (T entity) throws IOException;
    int getNumOfRecords(String tableName) throws IOException;
}

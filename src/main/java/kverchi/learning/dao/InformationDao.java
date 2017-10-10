package kverchi.learning.dao;

import kverchi.learning.domain.Information;

import java.util.List;

/**
 * Created by Liudmyla Melnychuk on 10.10.2017.
 */
public interface InformationDao {
    List<Information> getAllRecords();
}

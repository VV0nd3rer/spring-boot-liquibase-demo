package kverchi.learning.service.impl;

import kverchi.learning.dao.InformationDao;
import kverchi.learning.domain.Information;
import kverchi.learning.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Liudmyla Melnychuk on 10.10.2017.
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    InformationDao informationDao;
    @Override
    public List<Information> getAllInfo() {
        return informationDao.getAllRecords();
    }
}

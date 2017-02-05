package fr.dauburger.service;

import fr.dauburger.dao.CuissonDao;
import fr.dauburger.model.Cuisson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
@Service("CuissonService")
@Transactional
    public class CuissonServiceImpl implements CuissonService {

		@Autowired
        private CuissonDao CuissonDao;

        @Transactional
        public void save(Cuisson p) {
            CuissonDao.save(p);
        }

        @Transactional
        public List<Cuisson> findAll() {
            return CuissonDao.findAll();
        }

        @Transactional
        public Cuisson findOneById(int id) {
            return CuissonDao.findOneById(id);
        }

        @Transactional
        public void remove(Cuisson p) {
            CuissonDao.remove(p);
        }


    }

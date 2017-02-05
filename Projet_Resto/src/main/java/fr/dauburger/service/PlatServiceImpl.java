package fr.dauburger.service;

import fr.dauburger.dao.PlatDao;
import fr.dauburger.model.Plat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
@Service("platService")
@Transactional
    public class PlatServiceImpl implements PlatService {

		@Autowired
        private PlatDao platDao;

        @Transactional
        public void save(Plat p) {
            platDao.save(p);
        }

        @Transactional
        public List<Plat> findAll() {
            return platDao.findAll();
        }

        @Transactional
        public Plat findOneById(int id) {
            return platDao.findOneById(id);
        }

        @Transactional
        public void remove(Plat p) {
            platDao.remove(p);
        }


    }

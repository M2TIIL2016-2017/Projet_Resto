package fr.dauburger.service;

import fr.dauburger.dao.OptionDao;
import fr.dauburger.model.Option;
import fr.dauburger.model.Plat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
@Service("optionService")
@Transactional
    public class OptionServiceImpl implements OptionService {

		@Autowired
        private OptionDao optionDao;

        @Transactional
        public void save(Option o) {
            optionDao.save(o);
        }

        @Transactional
        public List<Option> findAll() {
            return optionDao.findAll();
        }

        @Transactional
        public Option findOneById(int id) {
            return optionDao.findOneById(id);
        }

        @Transactional
        public void remove(Option o) {
            optionDao.remove(o);
        }
    }

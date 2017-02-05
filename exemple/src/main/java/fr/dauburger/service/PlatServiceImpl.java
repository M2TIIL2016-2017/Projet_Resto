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
        private PlatDao platRepository;

        public void setPlatRepository(PlatDao platRepository) {
            this.platRepository = platRepository;
        }

        @Transactional
        public void add(Plat p) {
            this.platRepository.add(p);
        }

        @Transactional
        public void update(Plat p) {
            this.platRepository.update(p);
        }

        @Transactional
        public List<Plat> findAll() {
            return this.platRepository.findAll();
        }

        @Transactional
        public Plat findOneById(int id) {
            return this.platRepository.findOneById(id);
        }

        @Transactional
        public void remove(Plat p) {
            this.platRepository.remove(p);
        }


    }

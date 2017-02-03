package dauburger.commande.repository;

import dauburger.commande.entity.Plat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
    @Service
    public class PlatServiceImpl implements PlatService {

        private PlatRepository platRepository;

        public void setPlatRepository(PlatRepository platRepository) {
            this.platRepository = platRepository;
        }

        @Override
        @Transactional
        public void add(Plat p) {
            this.platRepository.add(p);
        }

        @Override
        @Transactional
        public void update(Plat p) {
            this.platRepository.update(p);
        }

        @Override
        @Transactional
        public List<Plat> findAll() {
            return this.platRepository.findAll();
        }

        @Override
        @Transactional
        public Plat findOneById(int id) {
            return this.platRepository.findOneById(id);
        }

        @Override
        @Transactional
        public void remove(Plat p) {
            this.platRepository.remove(p);
        }


    }

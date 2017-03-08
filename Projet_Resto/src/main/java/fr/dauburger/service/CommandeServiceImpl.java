package fr.dauburger.service;

import fr.dauburger.dao.CommandeDao;
import fr.dauburger.model.Commande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
@Service("commandeService")
@Transactional
    public class CommandeServiceImpl implements CommandeService {

		@Autowired
        private CommandeDao commandeDao;

        @Transactional
        public void save(Commande c) {
            commandeDao.save(c);
        }

        @Transactional
        public List<Commande> findAll() {
            return commandeDao.findAll();
        }

        @Transactional
        public Commande findOneById(int id) {
            return commandeDao.findOneById(id);
        }

        @Transactional
        public void remove(Commande c) {
            commandeDao.remove(c);
        }
    }
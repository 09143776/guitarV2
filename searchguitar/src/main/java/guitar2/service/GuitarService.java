package guitar2.service;

import java.util.List;

import guitar2.dao.GuitarDaoImpl;
import guitar2.entity.Guitar;
import guitar2.entity.GuitarSpec;

public class GuitarService {

	private GuitarDaoImpl guitarDao=new GuitarDaoImpl();
	
	public List<Guitar> search(GuitarSpec spec) {
		// TODO Auto-generated method stub
		return guitarDao.search(spec);
	}

	public GuitarDaoImpl getGuitarDaoImpl() {
		return guitarDao;
	}

	public void setGuitarDaoImpl(GuitarDaoImpl guitarDaoImpl) {
		this.guitarDao = guitarDaoImpl;
	}


}

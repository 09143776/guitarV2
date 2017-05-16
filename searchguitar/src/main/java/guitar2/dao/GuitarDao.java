package guitar2.dao;

import java.util.List;

import guitar2.entity.Guitar;
import guitar2.entity.GuitarSpec;

public interface GuitarDao {

	List<Guitar> search(GuitarSpec spec);
}
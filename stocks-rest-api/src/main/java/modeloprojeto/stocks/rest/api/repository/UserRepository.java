package modeloprojeto.stocks.rest.api.repository;

import modeloprojeto.stocks.rest.api.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {

}

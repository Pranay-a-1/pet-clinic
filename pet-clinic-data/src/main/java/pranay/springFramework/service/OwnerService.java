package pranay.springFramework.service;

import pranay.springFramework.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

package pranay.springFramework.petclinic.service;

import pranay.springFramework.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

package example.Services;

import example.Model.Address;
import example.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public String addUpdateAddress(Address address){
        Address address1 =null;
        if (address.getAddId()!=null){
            Optional<Address> addressOptional = addressRepository.findById(address.getAddId());
            if (!addressOptional.isPresent())
                return "th given address id is not exist ";

        }

        addressRepository.save(address);
        return "Task Completed";
    }
}

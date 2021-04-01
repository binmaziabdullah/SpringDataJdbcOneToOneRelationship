package example.Controllers;

import example.Model.Address;
import example.Services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public String saveAndUpdateAddress(@RequestBody Address address){
        addressService.addUpdateAddress(address);
        return "Saved";
    }
}

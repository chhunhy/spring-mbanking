package co.istad.mbakingapi.init;

import co.istad.mbakingapi.domain.Role;
import co.istad.mbakingapi.features.user.RoleRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInit {
    private final RoleRepository roleRepository;
    @PostConstruct
    void init(){
        // auto generated
        if (roleRepository.count()<1){
            Role user = new Role();
            user.setName("USER");

            Role customer = new Role();
            customer.setName("CUSTOMER");

            Role staff = new Role();
            staff.setName("STAFF");

            Role admin = new Role();
            admin.setName("ADMIN");

            roleRepository.saveAll(
                    List.of(user,customer,staff,admin)
            );
        }

    }
}
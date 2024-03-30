package co.istad.mbakingapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String uuid;

    @Column(unique = true, nullable = false)
    private String nationalCardId;

    @Column(nullable = false)
    private Integer pin;  // Store 4-digit

    @Column(nullable = false)
    private String password;

    @Column(length = 50)
    private String name;

    private String profileImage;

    @Column(length = 8)
    private String gender;

    private LocalDateTime dob;
    @Column(unique = true, nullable = false, length = 30)
    private String phoneNumber;

    @Column(length = 100)
    private String cityOrProvince;

    @Column(length = 100)
    private String khanOrDistrict;

    @Column(length = 100)
    private String sangkatOrCommune;

    @Column(length = 100)
    private String village;

    @Column(length = 100)
    private String street;

    @Column(length = 100)
    private String employeeType;

    @Column(length = 100)
    private String position;

    @Column(length = 100)
    private String companyName;

    @Column(length = 100)
    private String mainSourceOfIncome;

    private BigDecimal monthlyIncomeRange;

    @Column(unique = true)
    private String oneSignalId;

    @Column(unique = true)
    private String studentIdCard;

    @OneToMany(mappedBy = "user")
    private List<UserAccount> userAccountList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    private Boolean isDeleted; // manage delete status (admin want to disable or remove an account)
    private Boolean isBlocked; // manage block status (when there is bad action happened)

    private LocalDateTime createdAt;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(unique = true,nullable = false)
//    private String uuid;
//    @Column(length = 50)
//    private String name;
//    @Column(length = 8)
//    private String gender;
//    @Column(unique = true)
//    private String oneSignalId;
//    @Column(unique = true)
//    private String studentIdCard;
//    private Boolean isDeleted;
//    private Boolean isStudent;
//
//
//    @OneToMany(mappedBy = "user")
//    //one user have many accounts
//    private List<UserAccount> userAccountList;
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "user_roles",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private List<Role> roles;
//
//    //JoinTable (name ="users_roles" )


}

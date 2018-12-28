package SpringBootFirst.SpringBootFirst.Service;

import SpringBootFirst.SpringBootFirst.Model.CustomUserDetails;
import SpringBootFirst.SpringBootFirst.Model.Student;
import SpringBootFirst.SpringBootFirst.Model.Users;
import SpringBootFirst.SpringBootFirst.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

/*
@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		UserInfo userInfo = userInfoDAO.getActiveUser(userName);
		GrantedAuthority authority = new SimpleGrantedAuthority(userInfo.getRole());

		User user = new User(userInfo.getUserName(),userInfo.getPassword(),Arrays.asList(authority));

		UserDetails userDetails = (UserDetails)user;
		return userDetails;
	}*/


//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<Users> optionalUsers = usersRepository.findByName(username);
//
//        optionalUsers
//                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
//        return optionalUsers
//                .map(CustomUserDetails::new).get();
//    }
    @Override
    public UserDetails loadUserByUsername(String usn) throws UsernameNotFoundException {
        Optional<Users> optionalUsers=usersRepository.findById(usn);

        optionalUsers.orElseThrow(()-> new UsernameNotFoundException("Username not found"));
        return optionalUsers.map(CustomUserDetails::new).get();

//
//        Users user=usersRepository.findById(usn).get();/
//        GrantedAuthority authority=new SimpleGrantedAuthority("ROLE_"+user.getRole().getRolename());
//        System.out.println("\nuser role is "+user.getRole().getRolename());
//        System.out.println("\nuser password is "+user.getPassword());
//        User user1=new User(user.getUsn(), user.getPassword(), Arrays.asList(authority));
////        User user1=new User(user.getUsn(), user.getPassword(), Arrays.asList(user.getRole().getRolename()));
////        UserDetails userDetails2
//        UserDetails userDetails=(UserDetails) user1;
//        System.out.println("Arrays.asList(authority) "+Arrays.asList(authority));
//        System.out.println("\n userdetails is "+userDetails);
//        return userDetails;
    }
}

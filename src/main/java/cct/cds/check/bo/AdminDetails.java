package cct.cds.check.bo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import cct.cds.check.mbg.model.Userlisting;

public class AdminDetails implements UserDetails{

    private Userlisting userlisting;

    public AdminDetails(Userlisting userlisting){
        this.userlisting = userlisting;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        if(userlisting.getUsertype()==1){
            list.add(new SimpleGrantedAuthority("Chief Administrator")); //单位管理员
        }
        else if(userlisting.getUsertype()==3){
            list.add(new SimpleGrantedAuthority("section Administrator"));//部门管理员
        }
        else if(userlisting.getUsertype()==5){
            list.add(new SimpleGrantedAuthority("operator"));//资产负责人
        }
        else if(userlisting.getUsertype()==7){
            list.add(new SimpleGrantedAuthority("boss"));//甲方
        }
        return list;
    }

    @Override
    public String getPassword() {
        return userlisting.getPasswd();
    }

    @Override
    public String getUsername() {
        return userlisting.getUsername();
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    } 
}

package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 角色表
 */
@Entity
@Table(name="Roles")
public class Roles {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="role_num")
    @SequenceGenerator(name="role_num",sequenceName="role_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "roleCode")  //角色编码
    private String roleCode;

    @Basic
    @Column(name = "roleName")  //角色名称
    private String roleNmae;

    @OneToMany(mappedBy="role",cascade={CascadeType.ALL})
    private Set<Users> users = new HashSet<>();     //用户集合

    @Basic
    @Column(name = "uncertaintyDelete")
    private Integer uncertaintyDelete;      //是否已删除

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleNmae() {
        return roleNmae;
    }

    public void setRoleNmae(String roleNmae) {
        this.roleNmae = roleNmae;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }

    public Integer getUncertaintyDelete() {
        return uncertaintyDelete;
    }

    public void setUncertaintyDelete(Integer uncertaintyDelete) {
        this.uncertaintyDelete = uncertaintyDelete;
    }
}

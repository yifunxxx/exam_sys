package cn.xsaf1207.sys.vo;

import cn.xsaf1207.sys.domain.Role;


public class RoleVo extends Role {
    Integer selected = 0;

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }
}

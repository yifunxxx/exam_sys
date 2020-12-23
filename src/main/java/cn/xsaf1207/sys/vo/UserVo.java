package cn.xsaf1207.sys.vo;

import cn.xsaf1207.sys.domain.User;
import lombok.Data;

@Data
public class UserVo extends User {
    private String[] ids;
}

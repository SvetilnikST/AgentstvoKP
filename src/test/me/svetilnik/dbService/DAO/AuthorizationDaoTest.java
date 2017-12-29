package me.svetilnik.dbService.DAO;

import me.svetilnik.agentstvo.servlet.model.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorizationDaoTest {
    @Test
    public void checkAccess() throws Exception {
        AuthorizationDao authorizationDao = new AuthorizationDao();
        UserRole userRole = authorizationDao.checkAccess("testuserlogin","fdg sdfg sdfgsdfg sdfg sdgf");
        assertEquals(userRole,UserRole.admin);
    }

    @Test
    public void getUserId() throws Exception {
        AuthorizationDao authorizationDao = new AuthorizationDao();
        long idReturn = authorizationDao.getUserId("testuserlogin");
        assertEquals(4,idReturn);
    }


}
package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.demo.api.*;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class EricAPISampleTest {
    @Test
    @MethodOwner(owner = "Eric")
    public void testDeleteUser() {
        DeleteUserMethod deleteUserMethod = new DeleteUserMethod(1);
        deleteUserMethod.callAPIExpectSuccess();
        deleteUserMethod.validateResponse(JSONCompareMode.STRICT);
    }

    @Test
    @MethodOwner(owner = "Eric")
    public void testGetUser() {
        GetUserMethods getUserMethods = new GetUserMethods(1);
        getUserMethods.callAPIExpectSuccess();
        getUserMethods.validateResponse(JSONCompareMode.STRICT);
        getUserMethods.validateResponseAgainstSchema("api/users/_get/rs.schema");
    }

    @Test
    @MethodOwner(owner = "Eric")
    public void testPatchUser() {
        PatchUserMethod patchUserMethod = new PatchUserMethod();
        patchUserMethod.callAPIExpectSuccess();
        patchUserMethod.validateResponse(JSONCompareMode.STRICT);
        patchUserMethod.validateResponseAgainstSchema("api/users/_patch/rs.schema");
    }

    @Test
    @MethodOwner(owner = "Eric")
    public void testPostUser() {
        PostUserMethod postUserMethod = new PostUserMethod();
        postUserMethod.addProperty("title", "Doctor");
        postUserMethod.addProperty("body", "Dr.Perry studied at Harvard University in 2002.");
        postUserMethod.addProperty("userId", 1);
        postUserMethod.callAPIExpectSuccess();
        postUserMethod.validateResponse(JSONCompareMode.STRICT);
        postUserMethod.validateResponseAgainstSchema("api/users/_post/rs.schema");
    }

}

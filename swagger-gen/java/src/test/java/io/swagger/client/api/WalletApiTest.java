/*
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletApi
 */
@Ignore
public class WalletApiTest {

    private final WalletApi api = new WalletApi();

    
    /**
     * Get wallet fund records
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletGetRecordsTest() throws ApiException {
        String startDate = null;
        String endDate = null;
        String currency = null;
        String walletFundType = null;
        String page = null;
        String limit = null;
        Object response = api.walletGetRecords(startDate, endDate, currency, walletFundType, page, limit);

        // TODO: test validations
    }
    
}

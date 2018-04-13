/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.model.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import io.swagger.client.JSON;

import static io.restassured.http.Method.*;

public class StoreApi {

    private RequestSpecBuilder reqSpec;

    private JSON json;

    private StoreApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
        this.json = new JSON();
    }

    public static StoreApi store(RequestSpecBuilder reqSpec) {
        return new StoreApi(reqSpec);
    }


    public DeleteOrderOper deleteOrder() {
        return new DeleteOrderOper(reqSpec);
    }

    public GetInventoryOper getInventory() {
        return new GetInventoryOper(reqSpec);
    }

    public GetOrderByIdOper getOrderById() {
        return new GetOrderByIdOper(reqSpec);
    }

    public PlaceOrderOper placeOrder() {
        return new PlaceOrderOper(reqSpec);
    }

    /**
     * Get JSON
     *
     * @return JSON object
     */
    public JSON getJSON() {
        return json;
    }

    /**
     * Set JSON
     *
     * @param json JSON object
     * @return StoreApi
     */
    public StoreApi setJSON(JSON json) {
        this.json = json;
        return this;
    }

    /**
    * Customise request specification
    */
    public StoreApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @see #orderIdPath ID of the order that needs to be deleted (required)
     */
    public class DeleteOrderOper {

        public static final String REQ_URI = "/store/order/{order_id}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public DeleteOrderOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public DeleteOrderOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /store/order/{order_id}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(DELETE, REQ_URI));
        }

        /**
         * @param orderId (String) ID of the order that needs to be deleted (required)
         */
        public DeleteOrderOper orderIdPath(Object orderId) {
            reqSpec.addPathParam("order_id", orderId);
            return this;
        }

        /**
         * Customise request specification
         */
        public DeleteOrderOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public DeleteOrderOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * return Map<String, Integer>
     */
    public class GetInventoryOper {

        public static final String REQ_URI = "/store/inventory";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetInventoryOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetInventoryOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /store/inventory
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /store/inventory
         * @return Map<String, Integer>
         */
        public Map<String, Integer> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Map<String, Integer>>(){}.getType();
            return getJSON().deserialize(execute(handler).asString(), type);
        }

        /**
         * Customise request specification
         */
        public GetInventoryOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetInventoryOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @see #orderIdPath ID of pet that needs to be fetched (required)
     * return Order
     */
    public class GetOrderByIdOper {

        public static final String REQ_URI = "/store/order/{order_id}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetOrderByIdOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetOrderByIdOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /store/order/{order_id}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /store/order/{order_id}
         * @return Order
         */
        public Order executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Order>(){}.getType();
            return getJSON().deserialize(execute(handler).asString(), type);
        }

        /**
         * @param orderId (Long) ID of pet that needs to be fetched (required)
         */
        public GetOrderByIdOper orderIdPath(Object orderId) {
            reqSpec.addPathParam("order_id", orderId);
            return this;
        }

        /**
         * Customise request specification
         */
        public GetOrderByIdOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetOrderByIdOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Place an order for a pet
     * 
     *
     * @see #body order placed for purchasing the pet (required)
     * return Order
     */
    public class PlaceOrderOper {

        public static final String REQ_URI = "/store/order";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public PlaceOrderOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public PlaceOrderOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /store/order
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        /**
         * POST /store/order
         * @return Order
         */
        public Order executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Order>(){}.getType();
            return getJSON().deserialize(execute(handler).asString(), type);
        }

         /**
         * @param body (Order) order placed for purchasing the pet (required)
         */
        public PlaceOrderOper body(Order body) {
            reqSpec.setBody(getJSON().serialize(body));
            return this;
        }

        /**
         * Customise request specification
         */
        public PlaceOrderOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public PlaceOrderOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
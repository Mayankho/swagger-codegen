/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.0-SNAPSHOT.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * UserApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_UserApi_H_
#define IO_SWAGGER_CLIENT_API_UserApi_H_


#include <client/ApiClient.h>

#include <client/model/User.h>
#include <vector>
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  IUserApi
{
public:
    virtual ~IUserApi() = default;
    virtual pplx::task<void> createUser(
        std::shared_ptr<User> body
    ) = 0;
    virtual pplx::task<void> createUsersWithArrayInput(
        std::vector<std::shared_ptr<User>> body
    ) = 0;
    virtual pplx::task<void> createUsersWithListInput(
        std::vector<std::shared_ptr<User>> body
    ) = 0;
    virtual pplx::task<void> deleteUser(
        utility::string_t username
    ) = 0;
    virtual pplx::task<std::shared_ptr<User>> getUserByName(
        utility::string_t username
    ) = 0;
    virtual pplx::task<utility::string_t> loginUser(
        utility::string_t username,
        utility::string_t password
    ) = 0;
    virtual pplx::task<void> logoutUser(
    ) = 0;
    virtual pplx::task<void> updateUser(
        utility::string_t username,
        std::shared_ptr<User> body
    ) = 0;
};


class  UserApi : public IUserApi
{
public:
    UserApi( std::shared_ptr<ApiClient> apiClient );
    ~UserApi() override;
    /// <summary>
    /// Create user
    /// </summary>
    /// <remarks>
    /// This can only be done by the logged in user.
    /// </remarks>
    /// <param name="body">Created user object</param>
    pplx::task<void> createUser(
        std::shared_ptr<User> body
    ) override;
    /// <summary>
    /// Creates list of users with given input array
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="body">List of user object</param>
    pplx::task<void> createUsersWithArrayInput(
        std::vector<std::shared_ptr<User>> body
    ) override;
    /// <summary>
    /// Creates list of users with given input array
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="body">List of user object</param>
    pplx::task<void> createUsersWithListInput(
        std::vector<std::shared_ptr<User>> body
    ) override;
    /// <summary>
    /// Delete user
    /// </summary>
    /// <remarks>
    /// This can only be done by the logged in user.
    /// </remarks>
    /// <param name="username">The name that needs to be deleted</param>
    pplx::task<void> deleteUser(
        utility::string_t username
    ) override;
    /// <summary>
    /// Get user by user name
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="username">The name that needs to be fetched. Use user1 for testing.</param>
    pplx::task<std::shared_ptr<User>> getUserByName(
        utility::string_t username
    ) override;
    /// <summary>
    /// Logs user into the system
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="username">The user name for login</param>
    /// <param name="password">The password for login in clear text</param>
    pplx::task<utility::string_t> loginUser(
        utility::string_t username,
        utility::string_t password
    ) override;
    /// <summary>
    /// Logs out current logged in user session
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    pplx::task<void> logoutUser(
    ) override;
    /// <summary>
    /// Updated user
    /// </summary>
    /// <remarks>
    /// This can only be done by the logged in user.
    /// </remarks>
    /// <param name="username">name that need to be deleted</param>
    /// <param name="body">Updated user object</param>
    pplx::task<void> updateUser(
        utility::string_t username,
        std::shared_ptr<User> body
    ) override;

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_UserApi_H_ */


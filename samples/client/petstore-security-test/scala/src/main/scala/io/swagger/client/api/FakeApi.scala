/**
 * Swagger Petstore *_/ ' \" =end -- \\r\\n \\n \\r
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  *_/ ' \" =end --       
 *
 * OpenAPI spec version: 1.0.0 *_/ ' \" =end -- \\r\\n \\n \\r
 * Contact: apiteam@swagger.io *_/ ' \" =end -- \\r\\n \\n \\r
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

class FakeApi(val defBasePath: String = "https://petstore.swagger.io *_/ ' \" =end -- \\r\\n \\n \\r/v2 *_/ ' \" =end -- \\r\\n \\n \\r",
                        defApiInvoker: ApiInvoker = ApiInvoker) {

  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+0000")
  }
  implicit val stringReader = ClientResponseReaders.StringReader
  implicit val unitReader = ClientResponseReaders.UnitReader
  implicit val jvalueReader = ClientResponseReaders.JValueReader
  implicit val jsonReader = JsonFormatsReader
  implicit val stringWriter = RequestWriters.StringWriter
  implicit val jsonWriter = JsonFormatsWriter

  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value
  val config = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new FakeApiAsyncHelper(client, config)

  /**
   * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
   * 
   * @param testCodeInjectEndRnNR To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r (optional)
   * @return void
   */
  def testCodeInject * &#39; &quot; &#x3D;end  rn n r(testCodeInjectEndRnNR: Option[String] = None) = {
    val await = Try(Await.result(testCodeInject * &#39; &quot; &#x3D;end  rn n rAsync(testCodeInjectEndRnNR), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r asynchronously
   * 
   * @param testCodeInjectEndRnNR To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r (optional)
   * @return Future(void)
  */
  def testCodeInject * &#39; &quot; &#x3D;end  rn n rAsync(testCodeInjectEndRnNR: Option[String] = None) = {
      helper.testCodeInject * &#39; &quot; &#x3D;end  rn n r(testCodeInjectEndRnNR)
  }


}

class FakeApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def testCodeInject * &#39; &quot; &#x3D;end  rn n r(testCodeInjectEndRnNR: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/fake"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}

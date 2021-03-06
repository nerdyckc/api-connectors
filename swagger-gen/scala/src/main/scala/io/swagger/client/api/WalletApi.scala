/**
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

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.Number
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

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

import org.json4s._

class WalletApi(
  val defBasePath: String = "https://api-testnet.bybit.com",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new WalletApiAsyncHelper(client, config)

  /**
   * Get wallet fund records
   * 
   *
   * @param startDate Start point for result (optional)
   * @param endDate End point for result (optional)
   * @param currency Currency type (optional)
   * @param walletFundType wallet fund type (optional)
   * @param page Page. Default getting first page data (optional)
   * @param limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page (optional)
   * @return Any
   */
  def walletGetRecords(startDate: Option[String] = None, endDate: Option[String] = None, currency: Option[String] = None, walletFundType: Option[String] = None, page: Option[String] = None, limit: Option[String] = None): Option[Any] = {
    val await = Try(Await.result(walletGetRecordsAsync(startDate, endDate, currency, walletFundType, page, limit), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get wallet fund records asynchronously
   * 
   *
   * @param startDate Start point for result (optional)
   * @param endDate End point for result (optional)
   * @param currency Currency type (optional)
   * @param walletFundType wallet fund type (optional)
   * @param page Page. Default getting first page data (optional)
   * @param limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page (optional)
   * @return Future(Any)
   */
  def walletGetRecordsAsync(startDate: Option[String] = None, endDate: Option[String] = None, currency: Option[String] = None, walletFundType: Option[String] = None, page: Option[String] = None, limit: Option[String] = None): Future[Any] = {
      helper.walletGetRecords(startDate, endDate, currency, walletFundType, page, limit)
  }

  /**
   * Get risk limit.
   * 
   *
   * @return Any
   */
  def walletGetRiskLimit(): Option[Any] = {
    val await = Try(Await.result(walletGetRiskLimitAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get risk limit. asynchronously
   * 
   *
   * @return Future(Any)
   */
  def walletGetRiskLimitAsync(): Future[Any] = {
      helper.walletGetRiskLimit()
  }

  /**
   * Set risk limit
   * 
   *
   * @param symbol Contract type. 
   * @param riskId Risk ID. Can be found with the Get risk limit list endpoint. 
   * @return Any
   */
  def walletSetRiskLimit(symbol: String, riskId: Number): Option[Any] = {
    val await = Try(Await.result(walletSetRiskLimitAsync(symbol, riskId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Set risk limit asynchronously
   * 
   *
   * @param symbol Contract type. 
   * @param riskId Risk ID. Can be found with the Get risk limit list endpoint. 
   * @return Future(Any)
   */
  def walletSetRiskLimitAsync(symbol: String, riskId: Number): Future[Any] = {
      helper.walletSetRiskLimit(symbol, riskId)
  }

  /**
   * Get wallet fund records
   * 
   *
   * @param startDate Start point for result (optional)
   * @param endDate End point for result (optional)
   * @param coin Currency (optional)
   * @param status Withdraw status (optional)
   * @param page Page. Default getting first page data (optional)
   * @param limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page (optional)
   * @return Any
   */
  def walletWithdraw(startDate: Option[String] = None, endDate: Option[String] = None, coin: Option[String] = None, status: Option[String] = None, page: Option[String] = None, limit: Option[String] = None): Option[Any] = {
    val await = Try(Await.result(walletWithdrawAsync(startDate, endDate, coin, status, page, limit), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get wallet fund records asynchronously
   * 
   *
   * @param startDate Start point for result (optional)
   * @param endDate End point for result (optional)
   * @param coin Currency (optional)
   * @param status Withdraw status (optional)
   * @param page Page. Default getting first page data (optional)
   * @param limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page (optional)
   * @return Future(Any)
   */
  def walletWithdrawAsync(startDate: Option[String] = None, endDate: Option[String] = None, coin: Option[String] = None, status: Option[String] = None, page: Option[String] = None, limit: Option[String] = None): Future[Any] = {
      helper.walletWithdraw(startDate, endDate, coin, status, page, limit)
  }

}

class WalletApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def walletGetRecords(startDate: Option[String] = None,
    endDate: Option[String] = None,
    currency: Option[String] = None,
    walletFundType: Option[String] = None,
    page: Option[String] = None,
    limit: Option[String] = None
    )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/open-api/wallet/fund/records"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    startDate match {
      case Some(param) => queryParams += "start_date" -> param.toString
      case _ => queryParams
    }
    endDate match {
      case Some(param) => queryParams += "end_date" -> param.toString
      case _ => queryParams
    }
    currency match {
      case Some(param) => queryParams += "currency" -> param.toString
      case _ => queryParams
    }
    walletFundType match {
      case Some(param) => queryParams += "wallet_fund_type" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def walletGetRiskLimit()(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/open-api/wallet/risk-limit/list"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def walletSetRiskLimit(symbol: String,
    riskId: Number)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/open-api/wallet/risk-limit"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (symbol == null) throw new Exception("Missing required parameter 'symbol' when calling WalletApi->walletSetRiskLimit")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def walletWithdraw(startDate: Option[String] = None,
    endDate: Option[String] = None,
    coin: Option[String] = None,
    status: Option[String] = None,
    page: Option[String] = None,
    limit: Option[String] = None
    )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/open-api/wallet/withdraw/list"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    startDate match {
      case Some(param) => queryParams += "start_date" -> param.toString
      case _ => queryParams
    }
    endDate match {
      case Some(param) => queryParams += "end_date" -> param.toString
      case _ => queryParams
    }
    coin match {
      case Some(param) => queryParams += "coin" -> param.toString
      case _ => queryParams
    }
    status match {
      case Some(param) => queryParams += "status" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}

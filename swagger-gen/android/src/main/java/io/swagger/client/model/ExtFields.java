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

package io.swagger.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * extra fields
 **/
@ApiModel(description = "extra fields")
public class ExtFields {
  
  @SerializedName("o_req_num")
  private BigDecimal oReqNum = null;
  @SerializedName("xreq_type")
  private String xreqType = null;
  @SerializedName("xreq_offset")
  private BigDecimal xreqOffset = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOReqNum() {
    return oReqNum;
  }
  public void setOReqNum(BigDecimal oReqNum) {
    this.oReqNum = oReqNum;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getXreqType() {
    return xreqType;
  }
  public void setXreqType(String xreqType) {
    this.xreqType = xreqType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getXreqOffset() {
    return xreqOffset;
  }
  public void setXreqOffset(BigDecimal xreqOffset) {
    this.xreqOffset = xreqOffset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtFields extFields = (ExtFields) o;
    return (this.oReqNum == null ? extFields.oReqNum == null : this.oReqNum.equals(extFields.oReqNum)) &&
        (this.xreqType == null ? extFields.xreqType == null : this.xreqType.equals(extFields.xreqType)) &&
        (this.xreqOffset == null ? extFields.xreqOffset == null : this.xreqOffset.equals(extFields.xreqOffset));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.oReqNum == null ? 0: this.oReqNum.hashCode());
    result = 31 * result + (this.xreqType == null ? 0: this.xreqType.hashCode());
    result = 31 * result + (this.xreqOffset == null ? 0: this.xreqOffset.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtFields {\n");
    
    sb.append("  oReqNum: ").append(oReqNum).append("\n");
    sb.append("  xreqType: ").append(xreqType).append("\n");
    sb.append("  xreqOffset: ").append(xreqOffset).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

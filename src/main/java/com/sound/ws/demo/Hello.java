/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.sound.ws.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.sound.ws.pojo.Student;

/**
 * Examples code for spring boot with CXF services. Hello is the interface for
 * sayHello interface. This class was generated by Apache CXF 3.1.0
 * 2015-05-18T13:02:03.098-05:00 Generated source version: 3.1.0
 */
/**
 * 
 * // 标准 JWS 批注， 用于指定 Web Service 的
 * portType名称为“ComplexPortType”，其公共服务名为“ComplexService”， 在生成的 WSDL
 * 中使用的targetNamespace 为“http://example.org”
 * 
 * @WebService(serviceName="ComplexService", name="ComplexPortType",
 * targetNamespace="http://example.org")
 * 
 * // 标准 JWS 批注，用于指定这是 document-literal-wrapped Web Service
 * 
 * style 指定请求和响应SOAP消息的消息样式;
 * 
 * use 指定请求和响应 SOAP 消息的格式设置样式;
 * 
 * parameterStyle确定方法参数是否表示整个消息正文，或者这些参数是否为包装在根据该操作命名的顶级元素中的元素。
 * 
 * @SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL,
 * parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
 *
 */

@WebService(targetNamespace = "http://service.ws.sample/", name = "Hello")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface Hello {

	/**
	 * WebResult 批注用于指定生成的 WSDL 中的 操作结果的名称是“returnResult”，而不是 默认名称“return”。
	 */
	@WebResult(name = "returnResult", targetNamespace = "")
	@RequestWrapper(localName = "sayHello", targetNamespace = "http://service.ws.sample/", className = "com.sound.ws.demo.SayHello")
	/**
	 * 标准 JWS 批注，用于指定方法应公开为 公共操作。因为批注不包括 成员值“operationName”，所以操作的公共名称
	 * 将与方法名相同：sayHello。
	 * 
	 */
	@WebMethod(action = "urn:SayHello")
	@ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.ws.sample/", className = "com.sound.ws.demo.SayHelloResponse")
	/**
	 * WebParam 批注用于指定 WSDL 文件中的 输入参数名为“name”，而不是该参数的名称“myname”。
	 * 
	 */
	String sayHello(@WebParam(name = "name", targetNamespace = "") String myname);
	
	@WebMethod
	@WebResult(name = "StudentInfo", targetNamespace = "")
	public Student m1_object(@WebParam(name = "sid", targetNamespace = "") String sid);
}

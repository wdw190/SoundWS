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

import java.util.logging.Logger;

import com.sound.ws.pojo.Student;

/**
 * Examples code for spring boot with CXF services. HelloPortImpl is the
 * implementation for Hello interface. This class was generated by Apache CXF
 * 3.1.0 2015-05-18T13:02:03.098-05:00 Generated source version: 3.1.0
 */

/**
 * javax.jws.WebService JWS 批注的特性
 * 
 * -------------------------------------------------------------------
 * 
 * name
 * 
 * Web Service 的名称。映射到 WSDL 文件中的 <wsdl:portType> 元素。
 * 
 * 默认值为 JWS 文件中 Java 类的非限定名称。
 * 
 * -----------------------------------------------------------------
 * targetNamespace
 * 
 * 用于从此 Web Service 生成的 WSDL 和 XML 元素的 XML 名称空间。
 * 
 * 默认值由 JAX-RPC specification 指定。
 * ------------------------------------------------------------------
 * serviceName
 * 
 * Web Service 的服务名。映射到 WSDL 文件中的 <wsdl:service> 元素。
 * 
 * 默认值为 JWS 文件中 Java 类的非限定名称，后面加上字符串 Service。
 * -----------------------------------------------------------------------------
 * 
 * wsdlLocation
 * 
 * 预定义 WSDL 文件的相对或绝对 URL。如果指定此特性，则当 JWS 文件与 WSDL 文件中的端口类型和绑定不一致时，jwsc Ant 任务不生成
 * WSDL 文件，并且会返回错误。
 * 
 * -----------------------------------------------------------------------------------
 * endpointInterface
 * 
 * 现有服务端点接口文件的完全限定名称。如果指定此特性，则假设您已经创建了该端点接口文件，并且该文件位于 CLASSPATH 中。
 * ----------------------------------------------------------------------------------------------
 */
@javax.jws.WebService(serviceName = "HelloService", portName = "HelloPort", targetNamespace = "http://service.ws.sample/", endpointInterface = "com.sound.ws.demo.Hello")
public class HelloPortImpl implements Hello {

	private static final Logger LOG = Logger.getLogger(HelloPortImpl.class.getName());

	public java.lang.String sayHello(java.lang.String myname) {
		LOG.info("Executing operation sayHello" + myname);
		try {
			return "Hello, Welcome to CXF Spring boot " + myname + "!!!";

		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	@Override
	public Student m1_object(String sid) {

		Student student = new Student();

		student.setSid(sid);
		student.setName("赵子龙");
		student.setAge(58);

		return student;
	}

}
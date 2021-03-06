/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SetScanModeRequest extends RpcAcsRequest<SetScanModeResponse> {
	
	public SetScanModeRequest() {
		super("cloudwf", "2017-03-28", "SetScanMode");
	}

	private Integer operation;

	private List<String> macLists;

	public Integer getOperation() {
		return this.operation;
	}

	public void setOperation(Integer operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation.toString());
		}
	}

	public List<String> getMacLists() {
		return this.macLists;
	}

	public void setMacLists(List<String> macLists) {
		this.macLists = macLists;	
		for (int i = 0; i < macLists.size(); i++) {
			putQueryParameter("MacList." + (i + 1) , macLists.get(i));
		}	
	}

	@Override
	public Class<SetScanModeResponse> getResponseClass() {
		return SetScanModeResponse.class;
	}

}

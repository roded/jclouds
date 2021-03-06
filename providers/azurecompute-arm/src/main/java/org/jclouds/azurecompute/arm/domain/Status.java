/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.azurecompute.arm.domain;

import java.util.Date;

import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Status {

   @Nullable
   public abstract String code();

   @Nullable
   public abstract String level();

   @Nullable
   public abstract String displayStatus();

   @Nullable
   public abstract String message();

   @Nullable
   public abstract Date time();

   @SerializedNames({ "code", "level", "displayStatus", "message", "time" })
   public static Status create(final String code, final String level, final String displayStatus, final String message,
         final Date time) {
      return new AutoValue_Status(code, level, displayStatus, message, time);
   }
}

/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package keywhiz.api;

import org.junit.Test;

import static keywhiz.testing.JsonHelpers.asJson;
import static keywhiz.testing.JsonHelpers.fromJson;
import static keywhiz.testing.JsonHelpers.jsonFixture;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginRequestTest {
  private LoginRequest loginRequest = LoginRequest.from("keywhizAdmin", "adminPass".toCharArray());

  @Test public void roundTripSerialization() throws Exception {
    assertThat(fromJson(asJson(loginRequest), LoginRequest.class))
        .isEqualTo(loginRequest);
  }

  @Test public void deserializesCorrectly() throws Exception {
    assertThat(fromJson(jsonFixture("fixtures/loginRequest.json"), LoginRequest.class))
        .isEqualTo(loginRequest);
  }
}

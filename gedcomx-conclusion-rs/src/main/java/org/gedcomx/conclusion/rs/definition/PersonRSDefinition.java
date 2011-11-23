/**
 * Copyright 2011 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.conclusion.rs.definition;

import org.gedcomx.conclusion.Person;
import org.gedcomx.rt.www.ResourceServiceDefinition;
import org.gedcomx.rt.www.StatusCode;
import org.gedcomx.rt.www.StatusCodes;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * The person resource service is used to manage a conclusion person.
 *
 * @author Ryan Heaton
 */
@ResourceServiceDefinition (
  name = "Person"
)
public interface PersonRSDefinition extends CommonRSDefinition {

  /**
   * Read a person.
   *
   * @param uriInfo Information on the URI that was used to identify the person to read.
   * @return The person.
   */
  @GET
  @StatusCodes({
    @StatusCode( code = 200, condition = "Upon a successful read."),
    @StatusCode( code = 301, condition = "If the requested person has been merged to another person."),
    @StatusCode( code = 404, condition = "If the requested person is not found."),
    @StatusCode( code = 410, condition = "If the requested person has been deleted.")
  })
  Response readPerson(@Context UriInfo uriInfo);

  /**
   * Update a person.
   *
   * @param person The person to be used for the update.
   * @param uriInfo Information on the URI that was used to identify the person to update.
   */
  @PUT
  @StatusCodes({
    @StatusCode( code = 204, condition = "The update was successful.")
  })
  void updatePerson(@Context UriInfo uriInfo, Person person);

  /**
   * Delete a person.
   *
   * @param uriInfo Information on the URI that was used to identify the person to delete.
   */
  @DELETE
  @StatusCodes({
    @StatusCode ( code = 204, condition = "The delete was successful.")
  })
  void deletePerson(@Context UriInfo uriInfo);

}
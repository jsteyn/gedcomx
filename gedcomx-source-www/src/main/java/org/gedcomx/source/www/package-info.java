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

/**
 * The <b>source-www profile</b> models the necessary extensions to the source model to support
 * providing source data via the World Wide Web.
 *
 * @label Source WWW Profile
 */
@XmlSchema (
  namespace = SourceWWWConstants.GEDCOMX_SOURCE_WWW_NAMESPACE,
  elementFormDefault = XmlNsForm.QUALIFIED
)
@XmlAccessorOrder ( XmlAccessOrder.ALPHABETICAL )
@DefaultNamespace ( SourceConstants.GEDCOMX_SOURCE_NAMESPACE )
@Profile (
  label = "Source WWW Profile",
  description = "The source www profile supports extensions to the source profile necessary to expose source data to the World Wide Web.",
  namespaces = {
    @Namespace (
      id = "gxsw",
      uri = SourceWWWConstants.GEDCOMX_SOURCE_WWW_NAMESPACE,
      label = "Source WWW Namespace",
      description = "The source www namespace contains the objects necessary for modeling source data exposed via the World Wide Web.",
      version = "v1",
      xmlMediaType = "application/gedcomx-source-www-v1+xml",
      jsonMediaType = "application/gedcomx-source-www-v1+json"
    )
  }
)
package org.gedcomx.source.www;

import org.gedcomx.rt.DefaultNamespace;
import org.gedcomx.rt.Namespace;
import org.gedcomx.rt.Profile;
import org.gedcomx.source.SourceConstants;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
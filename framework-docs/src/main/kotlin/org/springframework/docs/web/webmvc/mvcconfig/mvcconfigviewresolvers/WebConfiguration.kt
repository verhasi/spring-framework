/*
 * Copyright 2002-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("DEPRECATION")

package org.springframework.docs.web.webmvc.mvcconfig.mvcconfigviewresolvers

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.view.json.MappingJackson2JsonView

// tag::snippet[]
@Configuration
class WebConfiguration : WebMvcConfigurer {
	override fun configureViewResolvers(registry: ViewResolverRegistry) {
		registry.enableContentNegotiation(MappingJackson2JsonView())
		registry.jsp()
	}
}
// end::snippet[]

/*
 Copyright (c) 2012 GFT Appverse, S.L., Sociedad Unipersonal.

 This Source Code Form is subject to the terms of the Appverse Public License
 Version 2.0 (“APL v2.0”). If a copy of the APL was not distributed with this
 file, You can obtain one at http://www.appverse.mobi/licenses/apl_v2.0.pdf. [^]

 Redistribution and use in source and binary forms, with or without modification,
 are permitted provided that the conditions of the AppVerse Public License v2.0
 are met.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. EXCEPT IN CASE OF WILLFUL MISCONDUCT OR GROSS NEGLIGENCE, IN NO EVENT
 SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT(INCLUDING NEGLIGENCE OR OTHERWISE)
 ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 POSSIBILITY OF SUCH DAMAGE.
 */
package org.appverse.web.framework.backend.persistence.services.integration;

import java.util.List;
import java.util.Map;

import org.appverse.web.framework.backend.api.model.integration.AbstractIntegrationBean;
import org.appverse.web.framework.backend.api.model.integration.IntegrationDataFilter;
import org.appverse.web.framework.backend.api.model.integration.ResultIntegrationBean;
import org.appverse.web.framework.backend.persistence.services.integration.helpers.QueryJpaCallback;

public interface IJPAPersistenceService<T extends AbstractIntegrationBean> {

	void delete(T bean) throws Exception;

	void deleteAll() throws Exception;

	List<T> execute(QueryJpaCallback<T> query) throws Exception;

	List<T> execute(String queryString) throws Exception;

	List<T> execute(String queryString, Map<String, Object> parameters)
			throws Exception;

	List<T> execute(final String queryString,
			final Map<String, Object> parameters, final int maxRecords,
			final int firstResult) throws Exception;

	int executeCount(final IntegrationDataFilter filter) throws Exception;

	int executeCount(final String queryString,
			final Map<String, Object> parameters) throws Exception;

	<U extends ResultIntegrationBean>  List<U> executeResult(QueryJpaCallback<U> query) throws Exception;

	<U extends ResultIntegrationBean>  List<U> executeResult(String queryString) throws Exception;

	<U extends ResultIntegrationBean>  List<U> executeResult(String queryString, Map<String, Object> parameters)
			throws Exception;

	<U extends ResultIntegrationBean>  List<U> executeResult(final String queryString,
			final Map<String, Object> parameters, final int maxRecords,
			final int firstResult) throws Exception;

	void executeUpdate(String queryString) throws Exception;

	void executeUpdate(String queryString, Map<String, Object> parameters)
			throws Exception;

	void flush() throws Exception;

	long persist(T bean) throws Exception;

	void refresh() throws Exception;

	void refresh(final T beanP) throws Exception;

	T retrieve(final IntegrationDataFilter filter) throws Exception;

	T retrieve(long pk) throws Exception;

	T retrieve(T bean) throws Exception;

	List<T> retrieveAll() throws Exception;

	List<T> retrieveAll(IntegrationDataFilter filter) throws Exception;

	@SuppressWarnings("rawtypes")
	List retrieveAll(final String queryName, final Object... values)
			throws Exception;

}

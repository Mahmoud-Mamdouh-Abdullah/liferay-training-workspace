package com.code81.tmo.liferay.rest.internal.graphql.query.v1_0;

import com.code81.tmo.liferay.rest.dto.v1_0.News;
import com.code81.tmo.liferay.rest.dto.v1_0.NewsResponse;
import com.code81.tmo.liferay.rest.resource.v1_0.NewsResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Generated("")
public class Query {

	public static void setNewsResourceComponentServiceObjects(
		ComponentServiceObjects<NewsResource>
			newsResourceComponentServiceObjects) {

		_newsResourceComponentServiceObjects =
			newsResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {news(date: ___, keyword: ___, page: ___, size: ___){newses, page, size, totalCount, totalPages}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Retrieve News")
	public NewsResponse news(
			@GraphQLName("keyword") String keyword,
			@GraphQLName("date") String date, @GraphQLName("page") String page,
			@GraphQLName("size") String size)
		throws Exception {

		return _applyComponentServiceObjects(
			_newsResourceComponentServiceObjects,
			this::_populateResourceContext,
			newsResource -> newsResource.getNews(keyword, date, page, size));
	}

	@GraphQLName("NewsPage")
	public class NewsPage {

		public NewsPage(Page newsPage) {
			actions = newsPage.getActions();

			items = newsPage.getItems();
			lastPage = newsPage.getLastPage();
			page = newsPage.getPage();
			pageSize = newsPage.getPageSize();
			totalCount = newsPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map<String, String>> actions;

		@GraphQLField
		protected java.util.Collection<News> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(NewsResource newsResource)
		throws Exception {

		newsResource.setContextAcceptLanguage(_acceptLanguage);
		newsResource.setContextCompany(_company);
		newsResource.setContextHttpServletRequest(_httpServletRequest);
		newsResource.setContextHttpServletResponse(_httpServletResponse);
		newsResource.setContextUriInfo(_uriInfo);
		newsResource.setContextUser(_user);
		newsResource.setGroupLocalService(_groupLocalService);
		newsResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<NewsResource>
		_newsResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction
		<Object, String, com.liferay.portal.kernel.search.filter.Filter>
			_filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, com.liferay.portal.kernel.search.Sort[]>
		_sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}
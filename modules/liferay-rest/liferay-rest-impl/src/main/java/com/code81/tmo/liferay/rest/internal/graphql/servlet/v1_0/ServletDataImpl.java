package com.code81.tmo.liferay.rest.internal.graphql.servlet.v1_0;

import com.code81.tmo.liferay.rest.internal.graphql.mutation.v1_0.Mutation;
import com.code81.tmo.liferay.rest.internal.graphql.query.v1_0.Query;
import com.code81.tmo.liferay.rest.internal.resource.v1_0.NewsResourceImpl;
import com.code81.tmo.liferay.rest.resource.v1_0.NewsResource;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Query.setNewsResourceComponentServiceObjects(
			_newsResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "LiferayRest";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/liferay-rest-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"query#news",
						new ObjectValuePair<>(
							NewsResourceImpl.class, "getNews"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<NewsResource>
		_newsResourceComponentServiceObjects;

}
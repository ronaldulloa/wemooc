/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.lms.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link CourseService}.
 * </p>
 *
 * @author    TLS
 * @see       CourseService
 * @generated
 */
public class CourseServiceWrapper implements CourseService,
	ServiceWrapper<CourseService> {
	public CourseServiceWrapper(CourseService courseService) {
		_courseService = courseService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _courseService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_courseService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _courseService.invokeMethod(name, parameterTypes, arguments);
	}

	public java.util.List<com.liferay.lms.model.Course> getCoursesOfGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseService.getCoursesOfGroup(groupId);
	}

	public com.liferay.lms.model.Course createCourse(java.lang.String name) {
		return _courseService.createCourse(name);
	}

	public java.util.List<java.lang.String> getCourseStudents(long courseId) {
		return _courseService.getCourseStudents(courseId);
	}

	public java.util.List<java.lang.String> getCourseTeachers(long courseId) {
		return _courseService.getCourseTeachers(courseId);
	}

	public java.util.List<java.lang.String> getCourseEditors(long courseId) {
		return _courseService.getCourseEditors(courseId);
	}

	public void addStudentToCourse(long courseId, java.lang.String login) {
		_courseService.addStudentToCourse(courseId, login);
	}

	public void addTeacherToCourse(long courseId, java.lang.String login) {
		_courseService.addTeacherToCourse(courseId, login);
	}

	public void addEditorToCourse(long courseId, java.lang.String login) {
		_courseService.addEditorToCourse(courseId, login);
	}

	public void removeStudentFromCourse(long courseId, java.lang.String login) {
		_courseService.removeStudentFromCourse(courseId, login);
	}

	public void removeTeacherFromCourse(long courseId, java.lang.String login) {
		_courseService.removeTeacherFromCourse(courseId, login);
	}

	public void removeEditorFromCourse(long courseId, java.lang.String login) {
		_courseService.removeEditorFromCourse(courseId, login);
	}

	public long getUserResult(long courseId, java.lang.String login) {
		return _courseService.getUserResult(courseId, login);
	}

	public java.util.List<com.liferay.lms.model.Course> myCourses()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseService.myCourses();
	}

	public void addUser(java.lang.String login, java.lang.String firstName,
		java.lang.String lastName, java.lang.String email, boolean isStudent,
		boolean isTeacher, boolean isParent) {
		_courseService.addUser(login, firstName, lastName, email, isStudent,
			isTeacher, isParent);
	}

	public void updateUser(java.lang.String login, java.lang.String firstName,
		java.lang.String lastName, java.lang.String email, boolean isStudent,
		boolean isTeacher, boolean isParent) {
		_courseService.updateUser(login, firstName, lastName, email, isStudent,
			isTeacher, isParent);
	}

	public void setParent(java.lang.String parentLogin,
		java.lang.String studentLogin) {
		_courseService.setParent(parentLogin, studentLogin);
	}

	public void unsetParent(java.lang.String parentLogin,
		java.lang.String studentLogin) {
		_courseService.unsetParent(parentLogin, studentLogin);
	}

	public void setTutor(java.lang.String tutorLogin,
		java.lang.String studentLogin) {
		_courseService.setTutor(tutorLogin, studentLogin);
	}

	public void unsetTutor(java.lang.String parentLogin,
		java.lang.String studentLogin) {
		_courseService.unsetTutor(parentLogin, studentLogin);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public CourseService getWrappedCourseService() {
		return _courseService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedCourseService(CourseService courseService) {
		_courseService = courseService;
	}

	public CourseService getWrappedService() {
		return _courseService;
	}

	public void setWrappedService(CourseService courseService) {
		_courseService = courseService;
	}

	private CourseService _courseService;
}
package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sd;

	@Override
	public Student save(Student s) {
		return sd.save(s);
	}

	@Override
	public void deleteById(int sid) {
		sd.deleteById(sid);
	}

	@Override
	public Student findBySid(int sid) {
		return sd.findBySid(sid);
	}

	@Override
	public List<Student> findAll() {
		return sd.findAll();
	}

	@Override
	public List<Student> findByScity(String scity) {
		return sd.findByScity(scity);
	}

	@Override
	public List<Student> findBySname(String sname) {
		return sd.findBySname(sname);
	}

	@Override
	public List<Student> findBySidAndSname(int sid, String sname) {
		return sd.findBySidAndSname(sid, sname);
	}

	@Override
	public List<Student> findBySidOrSname(int sid, String sname) {
		return sd.findBySidOrSname(sid, sname);
	}

	@Override
	public List<Student> findBySidIn(int [] arr) {
		return sd.findBySidIn(arr);
	}

	@Override
	public List<Student> findBySidBetween(int low, int high) {
		return sd.findBySidBetween(low, high);
	}

	@Override
	public List<Student> findBySidLessThan(int sid) {
		return sd.findBySidLessThan(sid);
	}

	@Override
	public List<Student> findBySpercentageBetween(int low, int high) {
		return sd.findBySpercentageBetween(low, high);
	}
	@Override
	public List<Student> findBySidNotIn(List<Integer> list) {
		return sd.findBySidNotIn(list);
	}
	@Override
	public List<Student> findBySnameEndsWith(String s1) {
		return sd.findBySnameEndsWith(s1);
	}
	@Override
	public List<Student> findBySnameStartsWith(String s1) {
		return sd.findBySnameStartsWith(s1);
	}@Override
	public List<Student> findBySnameContains(String s1) {
		return sd.findBySnameContains(s1);
	}
}

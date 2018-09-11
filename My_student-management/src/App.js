import React, { Component } from 'react';
import './App.css';
import TeacherHome from './StudentManagement/TeacherHome';
import AddNewStudent from './StudentManagement/AddNewStudent';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import ListOfStudents from "./StudentManagement/ListOfStudents";
import EditStudent from './StudentManagement/EditStudent';
import DeleteStudent from './StudentManagement/DeleteStudent';

class App extends Component 
{
  render() 
  {
    return(
      <div className="App">
       <header className="App-header">
          <h1 className="App-title">Welcome To Student Management System</h1>
        </header>  
      <Router>
        <div>
          <Switch>
            <Route exact path='/' component={TeacherHome}/>     
            <Route exact path='/ListOfStudents' component={ListOfStudents} />
            <Route exact path='/AddNewStudent' component={AddNewStudent} />
            <Route exact path="/ListOfStudents/EditStudent" component={EditStudent}/>
            <Route exact path="/ListOfStudents/DeleteStudent" component={DeleteStudent}/>
          </Switch>
        </div>
      </Router>
      <footer className="App-Footer">
        <h6>Copyright © 2018 StudentManagement , Inc. All rights reserved.</h6>
      </footer>
      </div>
    );
  }
}
export default App;
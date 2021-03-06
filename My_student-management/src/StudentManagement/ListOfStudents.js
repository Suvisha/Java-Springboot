import React from 'react';
import EditLink from './EditLink';
import './Button.css'
import Button from './Button';
//import TeacherHome from './TeacherHome';
import Student from './Students'

class ListOfStudents extends React.Component
{
    constructor(props)
    {
        super(props)
        this.state={students:[]}
        this.handleBack=this.handleBack.bind(this);
    }
    
    handleBack()
    {
        this.props.history.push('/');
    }
    render()
    {
        var students=this.props.students.map(student =>
			<Student key={student._links.self.href} student={student}/>
		);
        return( 
            <div>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th>Firstname</th>
                            <th>Lastname</th>
                            <th>Class</th>
                            <th>Division</th>
                            <th>AddressLine1</th>
                            <th>AddressLine2</th>
                            <th>PIN code</th>
                        </tr>
                        <tr>
                            {{students}}
                            <td><EditLink> </EditLink></td>
                        </tr>
                    </thead>
                </table>
                <Button buttonName="Back" handleOnClick={this.handleBack}/>
            </div>
        );
    }
}
export default ListOfStudents;  
























    // constructor(props)
    // {
    //     super(props);
    //     this.handleList = this.handleList.bind(this);
    // }
    // handleList()
    // {
    //     var names = [['1','Venu','v c', '9','D','MP,Null stop','pune','780405'],
    //                 ['2','Veag','Kta', '9','A','hp,Swargate','pune','780404'],
    //                 ['3','ragha','Sha', '9','B','LK,Karve road','pune','780801']];
    //     return (
    //         <div >
                
    //         <table>
    //         {
                
    //             names.map(function(name, index) 
    //             {
    //                 return <div> 
    //                         <tr>
    //                             <td>{name[0]}</td>
    //                             <td>{name[1]}</td>
    //                             <td>{name[2]}</td>
    //                             <td>{name[3]}</td>
    //                             <td>{name[4]}</td>
    //                             <td>{name[5]}</td>
    //                             <td>{name[6]}</td>
    //                             <td>{name[7]}</td>
    //                             <td><EditLink></EditLink></td>
    //                             <td><DeleteLink></DeleteLink></td>
    //                         </tr>
    //                       </div>
    //             })
    //         }
    //         </table>
    //     </div>
    //     )
    // }
    // render() {
    // return (
    //         <div>
    //             <center> {this.handleList()} </center>
    //         </div>
    //         );
    //         }



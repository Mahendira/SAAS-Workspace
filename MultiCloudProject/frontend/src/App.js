import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import HomePage from './components/Home';
import BasicPage from './BasicPage';
import MediumPage from './MediumPage';
import AdvancedPage from './AdvancedPage';

const App = () => {
    return (
        <Router>
            <Routes>
                {/* Define routes for each page */}
                <Route path="/" element={<HomePage />} />
                <Route path="/basic" element={<BasicPage />} />
                <Route path="/medium" element={<MediumPage />} />
                <Route path="/advanced" element={<AdvancedPage />} />
            </Routes>
        </Router>
    );
};

export default App;


//
//import React from 'react';
//import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
//import BasicPage from './BasicPage';
//import MediumPage from './MediumPage';
//import AdvancedPage from './AdvancedPage';
//
//const App = () => {
//    return (
//        <Router>
//            <div>
//                <h1>Home Page</h1>
//                <div>
//                    <Link to="/basic"><button>Basic</button></Link>
//                    <Link to="/medium"><button>Medium</button></Link>
//                    <Link to="/advanced"><button>Advanced</button></Link>
//                </div>
//                <Routes>
//                    <Route path="/basic" element={<BasicPage />} />
//                    <Route path="/medium" element={<MediumPage />} />
//                    <Route path="/advanced" element={<AdvancedPage />} />
//                </Routes>
//            </div>
//        </Router>
//    );
//};
//
//export default App;

-- Available channels:
INSERT INTO Channel (id, category, name) VALUES (1, 'Sports', 'Arsenal TV');
INSERT INTO Channel (id, category, name) VALUES (2, 'Sports', 'Chelsea TV');
INSERT INTO Channel (id, category, name) VALUES (3, 'Sports', 'Liverpool TV');
INSERT INTO Channel (id, category, name) VALUES (4, 'News',   'Sky News');
INSERT INTO Channel (id, category, name) VALUES (5, 'News',   'Sky Sport News');

-- Available locations:
INSERT INTO Location (id, name) VALUES (1, 'London');
INSERT INTO Location (id, name) VALUES (2, 'Liverpool');

-- London channels:
INSERT INTO ChannelByLocation (id, locationId, channelId) VALUES (1, 1, 1);
INSERT INTO ChannelByLocation (id, locationId, channelId) VALUES (2, 1, 2);
INSERT INTO ChannelByLocation (id, locationId, channelId) VALUES (3, 1, 4);
INSERT INTO ChannelByLocation (id, locationId, channelId) VALUES (4, 1, 5);

-- Liverpool channels:Id
INSERT INTO ChannelByLocation (id, locationId, channelId) VALUES (5, 2, 3);
INSERT INTO ChannelByLocation (id, locationId, channelId) VALUES (6, 2, 4);
INSERT INTO ChannelByLocation (id, locationId, channelId) VALUES (7, 2, 5);
